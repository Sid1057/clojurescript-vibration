# clojurescript-vibration
##Overview

###Example:###
``` clojure
(vibrate 1000) ;vibration by one second
```
``` clojure
(vibrate 1000 2000 3000) ;vibrate 1 second
                         ;pause 2 seconds
                         ;vibrate 3 seconds
```

###Functions:###
``` clojure
(is-vibration-supported); Return true if the navigator contains vibrate property.

(vibrate duration); If vibration supported by browser device 
                  ; will vibrate by odd elements of duration vector 
                  ; with pauses by even elements of vector.
```
##
