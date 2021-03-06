package stivik.SimpleNetworkLib.Util;

/**
 * SimpleNetworkLib:
 * @author Stefan Kürzeder
 * created on 13.05.2016 in BY, Germany
 */
public enum EventType {
    ON_ERROR, ON_MESSAGE, // NetListener
    ON_PRE_START, ON_POST_START, //ServerListener
    ON_CONNECTED, ON_DISCONNECTED, ON_CONNECTION_LOST // ClientListener
}
