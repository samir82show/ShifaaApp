/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity.domain.util;

import javax.servlet.http.Part;

public class InsuranceImageUploader extends AbstractImageUploader {

    private static InsuranceImageUploader insuranceImageUploader = null;

    private InsuranceImageUploader(Part image, String folderName) {
        super(image, folderName);
    }

    public static InsuranceImageUploader getInstance(Part image, String folderName) {
        if (insuranceImageUploader == null) {
            insuranceImageUploader = new InsuranceImageUploader(image, folderName);
        }
        return insuranceImageUploader;
    }

}
