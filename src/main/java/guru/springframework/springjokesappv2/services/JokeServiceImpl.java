package guru.springframework.springjokesappv2.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes chuckNorrisQuotes;
    @Autowired
    public JokeServiceImpl(){
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }
    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
