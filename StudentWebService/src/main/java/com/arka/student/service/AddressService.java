package com.arka.student.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.arka.student.dao.AddressDao;
import com.arka.student.exception.DataNotFoundException;
import com.arka.student.model.Address;

@Path("/addService")
public class AddressService {
	AddressDao dao=new AddressDao();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/addAddress")
	public void address(Address address) {
		dao.saveAddress(address);	
	}

	@Path("/get/{id}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Address getAddressById(@PathParam("id") int id) {
		Address address=dao.getAddressById(id);
		if(address==null) {
			throw new DataNotFoundException("Record belongs to "+ id +" not available");
		}
		return address;
		
	}
}
