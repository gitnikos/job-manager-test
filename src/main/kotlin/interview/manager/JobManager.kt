package interview.manager

import interview.domain.Job
import interview.cluster.ExternalClusterService
import java.time.Clock

/**
 * Represents a proxy-server that submits jobs to an external cluster and monitors their progress
 *
 * @property externalClusterService represents the call to an external API to submit jobs and get statuses
 * @property clock used for timestamping status changes
 */
class JobManager(
    private val externalClusterService: ExternalClusterService,
    private val clock: Clock = Clock.systemUTC()) {

    /**
     * Accepts and submits a job to the external cluster service.
     *
     * - Returns ACCEPTED, if the job's payload was valid
     * - Returns SUBMITTED, if the job was successfully submitted to the external cluster
     * - Returns FAILED, if the job could not be submitted to the external cluster
     *
     * @param job The job to submit (with a client provided id)
     * @return ACCEPTED, SUBMITTED, FAILED
     * @throws IllegalArgumentException if the job already exists
     */
    fun submit(job: Job) : JobManagerStatus {
        TODO()
    }

    /**
     * Get current status of a job
     *
     * @param clientJobId The id of the job
     * @return Current status of that job
     * @throws IllegalArgumentException if the job id cannot be found
     */
    fun getStatus(clientJobId: Int) : JobManagerStatus {
        TODO()
    }

    /**
     * Get history of the job (timestamp + status)
     *
     * @param clientJobId The id of the job
     * @return TBC
     * @throws IllegalArgumentException if the job id cannot be found
     */
    fun getHistory(clientJobId: Int) {
        TODO()
    }

}