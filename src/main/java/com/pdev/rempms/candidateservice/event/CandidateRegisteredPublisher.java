package com.pdev.rempms.candidateservice.event;

import com.pdev.rempms.candidateservice.model.candidate.Candidate;

public interface CandidateRegisteredPublisher {

    void publishCandidateRegisteredEvent(Candidate candidate, String email, String fullName);
}
