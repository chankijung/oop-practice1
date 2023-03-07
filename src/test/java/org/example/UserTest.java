package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @DisplayName("패스워드 초기화한다.")
    @Test
    void passwordTest() {
        //given
        User user = new User();

        //when
        user.initPassword();
        //then
        assertThat(user.getPassword()).isNotNull();
    }
}