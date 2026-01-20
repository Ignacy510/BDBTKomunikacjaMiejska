function autoLogOut(){
    const idleDurationSecs = 900;
    const redirectUrl = "javascript:document.LogoutForm.submit()";
    let idleTimeout;

    const resetIdleTimeout = function() {
        if(idleTimeout) clearTimeout(idleTimeout);
        idleTimeout = setTimeout(() => location.href = redirectUrl, idleDurationSecs * 1000);
    };

    resetIdleTimeout();

    ['click', 'touchstart', 'mousemove', 'keydown', 'scroll'].forEach(evt =>
        document.addEventListener(evt, resetIdleTimeout, false)
    );
}

var map = null;
var marker = null;

function initMap() {
    if (map !== null) return;

    map = L.map('osmMap').setView([52.2297, 21.0122], 13);

    L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
        maxZoom: 19,
        attribution: '&copy; <a href="http://www.openstreetmap.org/copyright">OpenStreetMap</a>'
    }).addTo(map);
}

function openMap(latStr, lonStr, address) {
    var titleEl = document.getElementById('mapTitle');
    if(titleEl) titleEl.innerText = address;

    var lat = parseFloat(String(latStr).replace(',', '.'));
    var lon = parseFloat(String(lonStr).replace(',', '.'));

    if (isNaN(lat) || isNaN(lon)) {
        alert("Błędne współrzędne GPS dla tego przystanku.");
        return;
    }

    initMap();

    map.setView([lat, lon], 16);

    if (marker !== null) {
        marker.setLatLng([lat, lon]);
    } else {
        marker = L.marker([lat, lon]).addTo(map);
    }
}

document.addEventListener("DOMContentLoaded", function() {
    if (document.forms['LogoutForm']) {
        autoLogOut();
    }

    var mapModal = document.getElementById('mapModal');
    if (mapModal) {
        mapModal.addEventListener('shown.bs.modal', function () {
            if (map) {
                map.invalidateSize();
                if(marker) {
                    map.panTo(marker.getLatLng());
                }
            }
        });
    }
});