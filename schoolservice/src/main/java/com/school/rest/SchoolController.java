package com.school.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.school.Schoolconfig;
import com.school.service.SchoolDelegateService;

@RestController
public class SchoolController {

	@Autowired
	SchoolDelegateService schooldelegate;
	
	@Autowired
	Schoolconfig schoolconfig;
	
	 @RequestMapping(value = "/getSchoolDetails/{schoolname}", method = RequestMethod.GET)
	    public String getStudents(@PathVariable String schoolname)
	    {
	        System.out.println("Going to call student service to get data!");
	        return schooldelegate.callStudentServiceAndGetData(schoolname);
	    }
	 
	 @RequestMapping(value = "/getstudentserviceport", method = RequestMethod.GET)
	    public String getStudentserviceport()
	    {
		 System.out.println("sdsdsdddsdsd");
//	        System.out.println("Check consul configuration "+schoolconfig.getTestkey());
	        return schooldelegate.callStudentServiceforstudentport();
	    }
}
