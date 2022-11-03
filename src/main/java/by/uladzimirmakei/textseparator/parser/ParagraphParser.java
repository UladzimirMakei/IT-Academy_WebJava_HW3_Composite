package by.uladzimirmakei.textseparator.parser;

import by.uladzimirmakei.textseparator.entity.TextType;

import static by.uladzimirmakei.textseparator.entity.TextType.PARAGRAPH;

public class ParagraphParser extends AbstractParser {
    private static final String PARAGRAPH_REGEX = "\\s{4}([\\w(,)?\\s]+[,.?]\\s?)?([\\w(,)?]+\\s?)+[,.?]";
    private static final TextType TEXT_TYPE = PARAGRAPH;

    @Override
    public String getUnitRegexPattern() {
        return PARAGRAPH_REGEX;
    }

    @Override
    public TextType getTextType() {
        return TEXT_TYPE;
    }
}
