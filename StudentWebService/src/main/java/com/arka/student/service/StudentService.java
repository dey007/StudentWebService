/*@Consumes specify the accepted request (internet media types), that a particular service will accept.
 * @Produces specify the response type (internet media types), that a particular service will return.
 * To make Jersey support JSON mapping, declares “jersey-json.jar” in Maven pom.xml file.
 * In web.xml, declares “com.sun.jersey.api.json.POJOMappingFeature” as “init-param” in Jersey mapped servlet. 
 * It will make Jersey support JSON/object mapping.
 * */

package com.arka.student.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arka.student.dao.StudentDao;
import com.arka.student.exception.DataNotFoundException;
import com.arka.student.model.Student;

@Path("/service")
public class StudentService {
	
	StudentDao dao=new StudentDao();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/add")
	public void student(Student std) {
		dao.saveStudent(std);	
	}

	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudentById(@PathParam("id") int id) {
		Student student=dao.getStudentById(id);
		if(student==null) {
			throw new DataNotFoundException("Record belongs to "+ id +" not available");
		}
		System.out.println(student);
		return student;
		
	}
}
