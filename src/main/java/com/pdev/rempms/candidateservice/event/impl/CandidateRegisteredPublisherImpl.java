package com.pdev.rempms.candidateservice.event.impl;

import com.pdev.rempms.candidateservice.builder.email.EmailRequestBuilder;
import com.pdev.rempms.candidateservice.constant.EventLogicalBindName;
import com.pdev.rempms.candidateservice.event.CandidateRegisteredPublisher;
import com.pdev.rempms.candidateservice.model.candidate.Candidate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CandidateRegisteredPublisherImpl implements CandidateRegisteredPublisher {

    private final StreamBridge streamBridge;
    private final EmailRequestBuilder emailRequestBuilder;

    @Async("candidateCreationVTExecutor")
    @Override
    public void publishCandidateRegisteredEvent(Candidate candidate, String email, String fullName) {
        log.info("Publishing candidate registered event asynchronously using virtual thread");

        // Here you would typically send the event to a message broker like Kafka or RabbitMQ
        streamBridge.send(
                EventLogicalBindName.CANDIDATE_REGISTRATION_EMAIL_OUT_0,
                emailRequestBuilder.getCandidateRegistrationEmailEventRequest(candidate, email, fullName)
        );
    }
}
