LICENSE = "BSD-3-Clause | LGPLv2.1+"
LIC_FILES_CHKSUM = "file://COPYING;md5=1de906ee96808d9776dd72a5f9a79a22 \
		    file://LICENSE.TXT;md5=771782cb6245c7fbbe74bc0ec059beff \
                    file://LICENSE-BSD.TXT;md5=c74e6304a772117e059458fb9763a928 \
                    file://OPCODE/COPYING;md5=5ff3ce96fdfd6ab78b031640a9e33eff \
                    file://contrib/OdeModelProcessor/LICENSE-BSD.TXT;md5=026686d878a6e8ced3c571bb073bac92 \
                    file://contrib/OdeModelProcessor/LICENSE.TXT;md5=771782cb6245c7fbbe74bc0ec059beff \
		    "

SRC_URI = "git://bitbucket.org/odedevs/ode.git;protocol=https;branch=0.16.x"

SRCREV = "4fb752d7d749c05f691cdfcf5fbca91811e92693"

S = "${WORKDIR}/git"

DEPENDS = "virtual/libgl freeglut virtual/libx11"

inherit cmake

EXTRA_OECMAKE = "-DODE_WITH_DEMOS=OFF -DODE_WITH_TEST=OFF"

