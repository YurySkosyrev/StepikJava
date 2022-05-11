package org.Stepik.Task_3_5_3;

public abstract class KeywordAnalyzer implements TextAnalyzer {

    protected abstract String[] getKeywords();

    protected abstract Label getLabel();

    @Override
    public Label processText(String text) {
        for(String str : getKeywords())
            if (text.contains(str))
                return getLabel();
        return Label.OK;
    }

}
