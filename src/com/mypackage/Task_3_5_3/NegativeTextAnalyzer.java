package com.mypackage.Task_3_5_3;

public class NegativeTextAnalyzer extends KeywordAnalyzer {

    private String[] keywords = new String[] {":(", "=(", ":|"};

    public String[] getKeywords(){
        return keywords;
    }

    public Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }

    @Override
    public Label processText(String text) {
        for(String str : keywords)
            if (text.contains(str))
                return Label.NEGATIVE_TEXT;
        return Label.OK;
    }
}
