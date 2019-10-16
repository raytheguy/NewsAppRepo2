package com.example.scrollingapplication; // <============= CHANGE ME

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeBooks {


    /***
     * Retrieves an Article object using the provided id.
     */
    public static Book getBooksById(int bookId) {
        return books.get(bookId);
    }

    /***
     * Return an ArrayList containing all the articles in the database.
     */
    public static ArrayList<Book> getAllArticles() {
        return new ArrayList<Book>((List) Arrays.asList(books.values().toArray()));
    }


    // You can ignore everything below this for now.
    private static final HashMap<Integer, Book> books = new HashMap<>();

    static {
        books.put(1, new Book(
                1,
                "The art of falling asleep",
                "Dionne Searcey",
                "Most people sleep at night in an hour while some fall in 2 minutes",
                "BANGUI, Central African Republic — The dealer pulled back a shiny pink curtain and sprinkled the contents of two white envelopes across his desk: sparkling diamonds, more than 100 of them.\n" +
                        "\n" +
                        "Some gems are sold legally, he explained. But many are trafficked by rebels who fight over the mines, adding fuel to a six-year uprising that has killed thousands and displaced more than a million people here in the Central African Republic.\n" +
                        "\n" +
                        "Now, hoping to wrest control over the diamond trade and piece the country back together, the government has turned to a new partner — Russia — in what some lawmakers fear is a dangerous bargain that trades one threat for another.\n" +
                        "\n" +
                        "Russian mercenaries have fanned out across the nation to train local soldiers. A former Russian spy has been installed by the Central African president as his top security adviser. Russians shuttled warlords to peace talks with the government, helping lead to a deal with more than a dozen armed groups to stop fighting."
        ));
        books.put(2, new Book(
                2,
                "101 Ways to Make Money",
                "Margaret Thatcher",
                "In a race to make a billion dollars",
                "Joseph R. Biden Jr.’s presidential campaign has sharply scaled back his online advertising, cutting spending so severely since August that he is now investing only a fraction of what his top rivals are on Facebook and Google, the two dominant internet platforms.\n" +
                        "\n" +
                        "In a race where many voters are following politics on their smartphones, Mr. Biden’s pullback is an unusual and potentially worrisome sign about his appeal among the Democratic activists, young people and donors who are especially engaged on social media. Candidates rarely withdraw so much money from their online campaigns unless they are seeing weak results in online fund-raising, according to interviews with digital strategists.\n" +
                        "\n" +
                        "As the candidates make their final pitches to donors before a quarterly fund-raising deadline at midnight Monday, Senator Elizabeth Warren of Massachusetts and other top rivals are outspending Mr. Biden online. He was only the sixth-biggest Democratic spender on Facebook ads in the seven days ending Thursday, even as he was at the center of a swirling national controversy involving President Trump, Ukraine and impeachment."
        ));

        books.put(3, new Book(
                3,
                "26 Shades of Blue",
                "Sarah Rebecca",
                "PARIS — World leaders and dignitaries gathered in Paris on Monday as France marked a national day of mourning for Jacques Chirac, the former French president who died last week.",
                "After Mr. Chirac’s family met privately on Monday morning, President Emmanuel Macron presided over a military ceremony in his honor in the courtyard of the Invalides monument in central Paris.\n" +
                        "\n" +
                        "A military band played the Marseillaise, France’s national anthem, before Mr. Chirac’s coffin, which was draped in the red, white and blue French flag, as a somber-looking Mr. Macron stood by.\n" +
                        "A funeral procession then brought the coffin to the Saint-Sulpice church, about a mile east, where former French presidents and dozens of French officials and politicians gathered for a religious service.\n" +
                        "\n" +
                        "One of Notre-Dame Cathedral’s main bells rang out to mark the procession’s departure, the first time it has tolled since a fire ravaged the building in April. Small crowds lined the streets and clapped as Mr. Chirac’s hearse, surrounded by a motorcade, slowly drove by."
        ));

        books.put(4, new Book(
                4,
                "The Life of an EY consultant",
                "Jason Lee",
                "Working until 2am and high on drugs",
                "Four inmates who are considered “extremely dangerous” escaped from a county jail in Ohio early Sunday morning after overpowering two guards, the authorities said.\n" +
                        "\n" +
                        "The inmates used a homemade weapon known as a shank and stole the keys to a corrections officer’s vehicle, which was used in the first part of their escape from the Gallia County Jail, Sheriff Matt Champlin said at a news conference.\n" +
                        "\n" +
                        "He said the inmates, all men, had help from at least one individual on the outside.\n" +
                        "\n" +
                        "The authorities said that a second vehicle was waiting for the inmates about a block from the jail and was later found in an unspecified part of Pennsylvania.\n" +
                        "\n" +
                        "The Westmoreland Mall near Pittsburgh was briefly closed because one of the escapees was believed to be in the area, the Pennsylvania State Police said.\n" +
                        "\n" +
                        "The sheriff said the two female jail officers who were on duty were not seriously injured during the escape, which happened around 12:15 a.m."
        ));


    }
}
