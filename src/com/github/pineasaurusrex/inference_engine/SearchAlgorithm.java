package com.github.pineasaurusrex.inference_engine;

public abstract class SearchAlgorithm {
    protected KnowledgeBase knowledgeBase;

    public SearchAlgorithm(KnowledgeBase kb) {
        this.knowledgeBase = kb;
    }

    public abstract boolean entails(PropositionalSymbol q);
}
