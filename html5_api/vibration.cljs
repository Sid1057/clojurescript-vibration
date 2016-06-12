(ns html5-api.vibration)

; Example:
;   (vibrate 1000) vibration by one second
;   (vibrate 1000 2000 3000) vibrate 1 second
;                            pause 2 seconds
;                            vibrate 3 seconds

(defn is-vibration-supported?
  "Return true if the navigator contains vibrate property."
  []
  (exists? js/navigator.vibrate))

(defn vibrate
  "If vibration supported by browser device will vibrate 
   by odd elements of duration vector with pauses by even 
   elements of vector."
  [duration]
  (if (is-vibration-supported?)
    (js/navigator.vibrate (clj->js duration))))
