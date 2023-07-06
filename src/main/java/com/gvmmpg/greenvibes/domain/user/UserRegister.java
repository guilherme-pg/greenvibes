package com.gvmmpg.greenvibes.domain.user;

public record UserRegister(String user_name,
                           String user_email,
                           String user_password,
                           String user_birthday,
                           String user_address,
                           String user_profession,
                           String user_level_schooling,
                           String user_gender,
                           String user_race,
                           byte[] user_photo) {
}
