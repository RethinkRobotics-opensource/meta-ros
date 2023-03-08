DESCRIPTION = "library to compute convex hulls, Delaunay triangulations and Voronoi diagrams."
HOMEPAGE = "http://www.qhull.org/"
SECTION = "libs"
LICENSE = "Qhull"
LIC_FILES_CHKSUM = "file://COPYING.txt;md5=484ee0cacf0472e8b40225b116f6296c"

SRC_URI = "http://www.qhull.org/download/qhull-2020-src-8.0.2.tgz"
SRC_URI[sha256sum] = "b5c2d7eb833278881b952c8a52d20179eab87766b00b865000469a45c1838b7e"

CFLAGS += "-fPIC"

EXTRA_OECMAKE += "\
    -DCMAKE_SKIP_RPATH=ON \
"

# Otherwise, cmake Target file will complain about binaries not found...
SYSROOT_DIRS:append = " \
    ${bindir} \
"

inherit cmake
