package interview.manager

import interview.cluster.ExternalClusterService
import interview.domain.Job
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
     *
     * @param job The job to submit (with a client provided id)
     * @return ACCEPTED, SUBMITTED
     * @throws IllegalArgumentException if the job already exists
     */
    fun submit(job: Job) : JobManagerStatus {
        TODO()
    }

}