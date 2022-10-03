SUMMARY = "This package provides cross-platform cross-python shutil.which functionality."
HOMEPAGE = "https://github.com/pydanny/whichcraft"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10aeddeae59172e5b47b6904402e5299"

SRC_URI = "git://github.com/cookiecutter/whichcraft.git;protocol=https;branch=master"

# Modify these as desired
PV = "0.6.1"
SRCREV = "e4812b24ecca3a14e93121632bac78fafc3906f2"

S = "${WORKDIR}/git"

inherit setuptools3

# WARNING: the following rdepends are determined through basic analysis of the
# python sources, and might not be 100% accurate.
RDEPENDS:${PN} += "python3-core"
