package com.pang.week1.domain;


import lombok.*;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CourseRequestDto {
    private final String title;
    private final String tutor;
}
