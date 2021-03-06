package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.Jobseeker;

public interface JobseekerService {

	Result add(Jobseeker jobseeker);
	DataResult<List<Jobseeker>> getAll();
	DataResult<Jobseeker> getJobseekerByNationalId(String nationalId);
}
