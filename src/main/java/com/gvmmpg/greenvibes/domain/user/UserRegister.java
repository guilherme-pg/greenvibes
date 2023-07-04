package com.gvmmpg.greenvibes.domain.user;

public record UserRegister(String user_name,
                           String user_email,
                           String user_password,
                           String user_phone,
                           String user_birthday,
                           String user_address) {
}
