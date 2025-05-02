package pro.sky.tms_auth_server.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pro.sky.tms_auth_server.configuration.SecurityConfig;
import pro.sky.tms_auth_server.entity.UzerEntity;
import pro.sky.tms_auth_server.repository.UzerRepository;

import static pro.sky.tms_auth_server.entity.UzerRole.ROLE_ADMIN;
import static pro.sky.tms_auth_server.entity.UzerRole.ROLE_USER;

@Component
public class DemoDataBaseLoader implements CommandLineRunner {

    private final UzerRepository uzerRepository;

    Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

    public DemoDataBaseLoader(UzerRepository uzerRepository) {
        this.uzerRepository = uzerRepository;
    }

    @Override
    public void run(String... args) throws Exception {

//                                                                      Demo: администратор (автор)
        UzerEntity admin = new UzerEntity("admin@tms.ru"
                , "$2a$10$qUi81fEBNL4xb4Vj.at6Q.qG7rcl.nrULwXf1VrtQtAFtKiuyXTEy", ROLE_ADMIN);

//                                                                      Demo: пользователи (исполнители)
        UzerEntity uzer1 = new UzerEntity("user1@tms.ru"
                , "$2a$10$UPozb.WWFzap5Nnc44nin.5VjXPx8.i3RMtGQQEeH4xEB80kdixIS", ROLE_USER);
        UzerEntity uzer2 = new UzerEntity("user2@tms.ru"
                , "$2a$10$MbNRtpuXqLFkfaV48rMeIOIYshsgvEMLiXNLl37Omdsmg/3hpZOjC", ROLE_USER);
        UzerEntity uzer3 = new UzerEntity("user3@tms.ru"
                , "$2a$10$nJDwIYvG8jztWOsc1rKyL.m.ddBt8tREwljwxVd1f2ck2/kAUVh6.", ROLE_USER);
        UzerEntity uzer4 = new UzerEntity("user4@tms.ru"
                , "$2a$10$7Tg3w8HvMWkWEF7k72eBZO6iwVnCc6V/lBiX8w7Gfo2l9sfKLWXWy", ROLE_USER);
        UzerEntity uzer5 = new UzerEntity("user5@tms.ru"
                , "$2a$10$fnIX8fKVsKqpJnuF7ApJdOTNXqBn0nYGO3JpbvwTwtqoQ3rpQnrZi", ROLE_USER);

        uzerRepository.save(admin);
        uzerRepository.save(uzer1);
        uzerRepository.save(uzer2);
        uzerRepository.save(uzer3);
        uzerRepository.save(uzer4);
        uzerRepository.save(uzer5);

        logger.debug("\"DemoDataBaseLoader\" was invoke ...");

    }

}
