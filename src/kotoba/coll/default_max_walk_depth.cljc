(ns kotoba.coll.default-max-walk-depth
  "default-max-walk-depth -- one definition, addressed on its own.

  Split out of kotoba.lang.text on 2026-09-09. The unit here is the
  DEFINITION, not the library: this repo holds default-max-walk-depth and names, in its
  deps.edn, exactly the definitions default-max-walk-depth reaches. Nothing else."
  )

(def default-max-walk-depth
  "Depth ceiling used when bounded-prewalk/bounded-postwalk are called
  without an explicit max-depth."
  1024)
