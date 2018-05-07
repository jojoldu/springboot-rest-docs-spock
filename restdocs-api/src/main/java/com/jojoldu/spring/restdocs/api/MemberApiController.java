package com.jojoldu.spring.restdocs.api;

import com.jojoldu.spring.restdocs.core.domain.Member;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jojoldu@gmail.com on 2018. 5. 2.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class MemberApiController {

    @GetMapping("/hello")
    public Hello helloWorld(@RequestParam String name){
        return new Hello("Hello World "+name);
    }

    @PostMapping("/member")
    public Member saveMember(@RequestBody Member member){
        return member;
    }

    @Getter
    public static class Hello {
        String greeting;

        public Hello(String greeting) {
            this.greeting = greeting;
        }
    }
}
