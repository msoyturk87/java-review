package com.cydeo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Status {

    // since its final I need to initiliaze
    /*
        - same statement
        - constr
        - init block (static )
     */

    OPEN("OPEN"),IN_PROGRESS("In Progress"),UAT_TEST("UAT Testing"),COMPLETED("Completed");
    private final String value;

}
