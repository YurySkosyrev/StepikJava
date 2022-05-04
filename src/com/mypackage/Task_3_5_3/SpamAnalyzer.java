package com.mypackage.Task_3_5_3;

public class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keywords;

    public SpamAnalyzer(String[] args){
        keywords = new String[args.length];
        for (int i =0; i < args.length; i++)
            keywords[i] = args[i];
    }

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
                return Label.SPAM;
        return Label.OK;
    }
}
