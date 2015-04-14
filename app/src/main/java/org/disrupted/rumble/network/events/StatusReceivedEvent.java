package org.disrupted.rumble.network.events;

import org.disrupted.rumble.message.StatusMessage;

import java.util.List;

/**
 * This event holds every information known on a received transmission that happened successfully.
 * These information includes:
 *
 * - The received status (as it was received)
 * - The sender
 * - The protocol used to transmit this status (rumble, firechat)
 * - The link layer used (bluetooth, wifi)
 * - The size of the data transmitted (bytes)
 * - The duration of the transmission (ms)
 *
 * These information will be used by different component to update some informations :
 *  - The CacheManager to update its list and the neighbour's queue as well
 *  - The LinkLayerAdapter to update its internal metric that is used by getBestInterface
 *  - The FragmentStatusList to provide a visual feedback to the user
 *
 * @author Marlinski
 */
public class StatusReceivedEvent {

    public StatusMessage status;
    public String sender;
    public String protocolID;
    public String linkLayerIdentifier;
    public long size;
    public long duration;

    public StatusReceivedEvent(StatusMessage status, String sender, String protocolID, String linkLayerIdentifier, long size, long duration) {
        this.status = status;
        this.sender = sender;
        this.protocolID = protocolID;
        this.linkLayerIdentifier = linkLayerIdentifier;
        this.size = size;
        this.duration = duration;
    }

}