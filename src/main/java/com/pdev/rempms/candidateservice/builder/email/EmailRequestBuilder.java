package com.pdev.rempms.candidateservice.builder.email;

import com.pdev.rempms.candidateservice.constant.CommonConstants;
import com.pdev.rempms.candidateservice.constant.email.EmailBody;
import com.pdev.rempms.candidateservice.constant.email.EmailSubject;
import com.pdev.rempms.candidateservice.dto.event.email.EmailEventRequest;
import com.pdev.rempms.candidateservice.model.candidate.Candidate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmailRequestBuilder {

    /**
     * This method is used to build email event request for candidate registered event
     *
     * @param candidate
     * @param email
     * @param fullName
     * @return {@link EmailEventRequest} - the email event request
     * @author maleeshasa
     */
    public EmailEventRequest getCandidateRegistrationEmailEventRequest(Candidate candidate, String email, String fullName) {
        EmailEventRequest eventRequest = new EmailEventRequest();
        eventRequest.setApplicationSource(CommonConstants.REMPMS_CANDIDATE);
        eventRequest.setToEmails(List.of(email));
        eventRequest.setSubject(EmailSubject.CANDIDATE_REGISTERED);
        eventRequest.setBody(
                String.format(
                        EmailBody.CANDIDATE_REGISTERED_BODY,
                        fullName,
                        candidate.getCandidateNo()
                )
        );
        eventRequest.setIsHtml(Boolean.TRUE);
        return eventRequest;
    }
}
