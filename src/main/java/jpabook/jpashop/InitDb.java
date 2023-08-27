package jpabook.jpashop;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class InitDb {


    @Component
    @Transactional
    @RequiredArgsConstructor
    static class InitService{

    }
}


