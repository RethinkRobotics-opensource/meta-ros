# generated recipe sets this to 3-Clause-BSD, which yocto does not understand
LICENSE = "BSD-3-Clause"

EXTRA_OECMAKE += " -DBUILD_SHARED_LIBS=ON "