package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     *  회원목록 조회:   GET     '/users'
     *  회원 등록:      POST    '/users'
     *  회원 조회:      GET     '/users/{userId}'
     *  회원 수정:      PATCH   '/users/{userId}'
     *  회원 삭제:      DELETE  '/users/{userID}'
     */


    @GetMapping
    public String user() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable(value = "userId") String userId) {
        return "get userID" + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUer(@PathVariable(value = "userId") String userId) {
        return "update userId=" + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable(value = "userId") String userId) {
        return "delete userId=" + userId;
    }
}
