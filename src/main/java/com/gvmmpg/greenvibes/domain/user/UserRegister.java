package com.gvmmpg.greenvibes.domain.user;

import java.sql.Blob;
import java.util.Date;

public record UserRegister(String user_name,
                           String user_email,
                           String user_password,
                           Date user_birthday,
                           String user_country,
                           String user_city,
                           String user_address,
                           String user_profession,
                           String user_level_schooling,
                           String user_gender,
                           String user_race
                           // Blob user_image
                            ) {
}
