package org.quelcertoleo;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException, URISyntaxException {
        final List<String> randomFirstNamesDE = FileReader.getNamesFromFile("FirstNamesGermany.txt");
        final List<String> randomLastNamesDE = FileReader.getNamesFromFile("LastNamesGermany.txt");
        final List<String> randomFirstNamesGB = FileReader.getNamesFromFile("FirstNamesBritain.txt");
        final List<String> randomLastNamesGB = FileReader.getNamesFromFile("LastNamesBritain.txt");
        final List<String> randomFirstNamesIT = FileReader.getNamesFromFile("FirstNamesItaly.txt");
        final List<String> randomLastNamesIT = FileReader.getNamesFromFile("LastNamesItaly.txt");
        final List<String> randomFirstNamesRU = FileReader.getNamesFromFile("FirstNamesRussia.txt");
        final List<String> randomLastNamesRU = FileReader.getNamesFromFile("LastNamesRussia.txt");
        final List<String> randomFirstNamesUS = FileReader.getNamesFromFile("FirstNamesUSA.txt");
        final List<String> randomLastNamesUS = FileReader.getNamesFromFile("LastNamesUSA.txt");

        final String randomFirstNameDE = getRandomNameFromList(randomFirstNamesDE);
        final String randomLastNameDE = getRandomNameFromList(randomLastNamesDE);
        final String randomFirstNameGB = getRandomNameFromList(randomFirstNamesGB);
        final String randomLastNameGB = getRandomNameFromList(randomLastNamesGB);
        final String randomFirstNameIT = getRandomNameFromList(randomFirstNamesIT);
        final String randomLastNameIT = getRandomNameFromList(randomLastNamesIT);
        final String randomFirstNameRU = getRandomNameFromList(randomFirstNamesRU);
        final String randomLastNameRU = getRandomNameFromList(randomLastNamesRU);
        final String randomFirstNameUS = getRandomNameFromList(randomFirstNamesUS);
        final String randomLastNameUS = getRandomNameFromList(randomLastNamesUS);

        System.out.println("DE:\t" + randomFirstNameDE + " " + randomLastNameDE);
        System.out.println("GB:\t" + randomFirstNameGB + " " + randomLastNameGB);
        System.out.println("IT:\t" + randomFirstNameIT + " " + randomLastNameIT);
        System.out.println("RU:\t" + randomFirstNameRU + " " + randomLastNameRU);
        System.out.println("US:\t" + randomFirstNameUS + " " + randomLastNameUS);

    }

    private static String getRandomNameFromList(final List<String> namesList) {
        Random random = new Random(System.currentTimeMillis());
        int randomElementPosition = random.nextInt(0, namesList.size() - 1);
        return namesList.get(randomElementPosition);
    }
}