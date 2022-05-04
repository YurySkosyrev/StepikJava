package com.mypackage.Task_3_5_3;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords = new String[] {":(", "=(", ":|"};

    @Override
    protected String[] getKeywords(){
        return keywords;
    }

    @Override
    protected Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}
