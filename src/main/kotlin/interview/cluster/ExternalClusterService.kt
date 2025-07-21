package interview.cluster

interface ExternalClusterService {

    // returns an id, if submission successful, else throws
    fun submitJob(payload: String) : Int

    // returns the status of a job, given an external job id
    fun getStatus(externalServiceJobId: Int) : ExternalServiceStatus
}


