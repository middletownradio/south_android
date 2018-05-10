package middletownmusic.org.southernradio.utils;

import middletownmusic.org.southernradio.models.Station;

public interface AdapterCallback {
    void openRadioCallback(Station station, int index);
}