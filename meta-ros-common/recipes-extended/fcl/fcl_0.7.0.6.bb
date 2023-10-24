DESCRIPTION = "FCL is a library for performing three types of proximity queries on a pair of geometric models composed of triangles and octrees."
HOMEPAGE = "https://github.com/flexible-collision-library/fcl"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7de20b14c33be61ee0c714b41e286d0b"

# Octomap dependency not included as it is optional.
DEPENDS = "boost libccd octomap libeigen"

SRCREV = "3f3d98a366799900be044852dd36aa54d1391239"
SRC_URI = " \
    git://github.com/flexible-collision-library/fcl;branch=master;protocol=https \
"

S = "${WORKDIR}/git"

EXTRA_OECMAKE_SSE = "-DFCL_USE_X64_SSE=OFF"
EXTRA_OECMAKE_SSE:x86-64 = ""
EXTRA_OECMAKE += " -DFCL_NO_DEFAULT_RPATH=OFF ${EXTRA_OECMAKE_SSE} -DBUILD_TESTING=OFF "

inherit pkgconfig cmake
