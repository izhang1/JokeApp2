package app.izhang.jokeprovider;

import java.util.Random;

public class JokeProvider {
    private String jokes[] = {"An extensive government study has revealed that the leading cause of cancer in laboratory rats is scientists.",
    "A lot of people cry when they cut onions. The trick is not to form an emotional bond",
    "I wrote a song about a tortilla. Well actually, it’s more of a wrap.",
    "When I was growing up, my mother’s best dish was store-bought Entenmann’s chocolate chip cookies.",
    "Instagram is just Twitter for people who go outside."};

    public String getJoke(){
        Random randomInt = new Random();
        return jokes[randomInt.nextInt(jokes.length)];
    }
}
