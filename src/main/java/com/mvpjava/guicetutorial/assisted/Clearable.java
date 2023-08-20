package com.mvpjava.guicetutorial.assisted;

import com.mvpjava.guicetutorial.assisted.exceptions.ClearanceException;

public interface Clearable {

    Clearance probeClearance() throws ClearanceException;
}
