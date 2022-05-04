package com.mypackage.Task_3_5_3;

public class SpamAnalyzer extends KeywordAnalyzer{

    private String[] keywords;

    public SpamAnalyzer(String[] args){
        keywords = new String[args.length];
        for (int i =0; i < args.length; i++)
            keywords[i] = args[i];
    }

    @Override
    protected String[] getKeywords(){
        return keywords;
    }

    @Override
    protected Label getLabel(){
        return Label.SPAM;
    }

}
