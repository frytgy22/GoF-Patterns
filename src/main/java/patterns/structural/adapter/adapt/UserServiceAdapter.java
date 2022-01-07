package patterns.structural.adapter.adapt;

import patterns.structural.adapter.Benutzer;

public class UserServiceAdapter implements UserService {
    private final Benutzer benutzer;

    public UserServiceAdapter(Benutzer benutzer) {
        this.benutzer = benutzer;
    }

    @Override
    public String getUserName() {
        return benutzer.benutzernamenBekommen();
    }

    @Override
    public String getEmail() {
        return benutzer.erhalteEmail();
    }
}
