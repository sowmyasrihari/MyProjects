package com.klef.ep.services;

import javax.ejb.Remote;
import com.klef.ep.models.Task;

@Remote
public interface TaskService 
{
	public String inserttask(Task t);
}
