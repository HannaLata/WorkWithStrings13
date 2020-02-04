package com.mainacad;

import com.mainacad.service.NumberManipulationService;
import org.apache.commons.lang3.StringUtils;

import java.util.logging.Logger;

public class AppRunner {

    private static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {

        LOGGER.info("Some info text");
        LOGGER.warning("Some warning text");
        LOGGER.severe("Some error text");

        String text = "Sum by division for 12345 is ";

        LOGGER.info(text +
                NumberManipulationService.getSumByDivision(12345));

        LOGGER.info("Sum by division for 12345 is " +
                NumberManipulationService.getSumByTypeManipulation(12345));

        StringBuilder stringBuilder = new StringBuilder("some text for string builder");
        stringBuilder.append(" , add some new text");

        LOGGER.info(stringBuilder.toString());

        StringBuffer stringBuffer = new StringBuffer("some text for string buffer");
        stringBuffer.append(" , add some new text");

        LOGGER.info(stringBuffer.toString());

        LOGGER.info(stringBuffer.reverse().toString());

        String testText = "abc1de 2fg3h i4jkl5mn";

        String modifiedText = testText.trim();
        String[] words = modifiedText.split(" ");

        LOGGER.info("Original:  " + testText);
        LOGGER.info("Trimmed: " + modifiedText);
        LOGGER.info("Last word: " + words[words.length-1]);
        LOGGER.info("Words: " + StringUtils.join(words, ", "));

        String name = "\"Hanna\"";
        int age = 27;
        LOGGER.info(String.format("My name is %s, I'm %d years old.", name, age));

        modifiedText = modifiedText.replaceAll("[a-z, A-Z]", "");
        LOGGER.info("Modified: " + modifiedText);




    }
}
