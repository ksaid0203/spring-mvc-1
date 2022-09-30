package hello.springmvc.basic.request;

import lombok.Data;

// lombok.data
// @Getter, @Setter, @toString, @EqualsAndHashCode, @RequiredArgsConstructor
// 를 자동으로 적용

@Data
public class HelloData {
    private String username;
    private int age;
}
