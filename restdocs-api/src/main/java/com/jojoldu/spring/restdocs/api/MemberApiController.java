package com.jojoldu.spring.restdocs.api;

import com.jojoldu.spring.restdocs.core.domain.Member;
import org.springframework.web.bind.annotation.*;

/**
 * Created by jojoldu@gmail.com on 2018. 5. 2.
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RestController
public class MemberApiController {

    @GetMapping("/hello")
    public String helloWorld(@RequestParam String name){
        return "Hello World "+name;
    }

    @PostMapping("/member")
    public Member saveMember(@RequestBody Member member){
        return member;

    }
}
