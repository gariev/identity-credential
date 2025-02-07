package com.android.identity.android.mdoc.transport;

/**
 * A generic interface for sending progress updates of a data transmission.
 */
public interface TransmissionProgressListener {

  /**
   * Callback to notify subscribers of progress updates. The number of times this callback fires
   * depends on the transport implementation. Subscribers can expect that on successful
   * completion of a transmission a call to this function will fire with progress == max.
   *
   * @param progress Progress value (&lt;= max)
   * @param max Maximum progress value (&gt;= progress)
   */
  void onProgressUpdate(long progress, long max);
}
