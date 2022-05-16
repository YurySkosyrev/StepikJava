package org.Stepik.Task353;

public class TooLongTextAnalyzer implements TextAnalyzer{

    private int maxLength;

    public TooLongTextAnalyzer(int i){
        maxLength = i;
    }

    @Override
    public Label processText(String text) {
        return text.length() > maxLength ? Label.TOO_LONG : Label.OK;
    }
}
