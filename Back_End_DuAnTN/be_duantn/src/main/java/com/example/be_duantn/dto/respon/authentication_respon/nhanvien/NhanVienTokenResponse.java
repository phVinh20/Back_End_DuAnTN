package com.example.be_duantn.dto.respon.authentication_respon.nhanvien;


import lombok.*;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NhanVienTokenResponse {

    private String accessToken;

    private String token;

    private String message;

    private String role;

    private UUID idtk;

    private String image;

    private String username;
}
