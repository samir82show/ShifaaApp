/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.domain.util;

import javax.servlet.http.Part;

public class DoctorImageUploader extends AbstractImageUploader {

    private static DoctorImageUploader doctorImageUploader = null;

    private DoctorImageUploader(Part image, String folderName) {
        super(image, folderName);
    }

    public static DoctorImageUploader getInstance(Part image, String folderName) {
        if (doctorImageUploader == null) {
            doctorImageUploader = new DoctorImageUploader(image, folderName);
        }
        return doctorImageUploader;
    }

}
