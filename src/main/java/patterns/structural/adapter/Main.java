package patterns.structural.adapter;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.adapter.adapt.UserService;
import patterns.structural.adapter.adapt.UserServiceAdapter;

@Slf4j
public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceAdapter(new Benutzer());
        log.info(userService.getEmail());
        log.info(userService.getUserName());
    }
}
