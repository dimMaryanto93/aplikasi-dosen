package id.ac.tazkia.dosen.entity;

import id.ac.tazkia.dosen.constant.SemesterConstant;
import id.ac.tazkia.dosen.constant.StatusRekomendasi;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author ivans
 */
@Entity
@Table(name = "t_kegiatan_dosen")
public class KegiatanDosen  implements Serializable{

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String keterangan;

    @NotNull
    @NotEmpty
    private String periode;

    @NotNull
    @Enumerated(EnumType.STRING)
    private SemesterConstant semester;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_dosen")
    private Dosen dosen;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_jenis_kegiatan")
    private JenisKegiatan jenisKegiatan;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_kategori_kegiatan")
    private KategoriKegiatan kategoriKegiatan;

    private int sks;
    
    @Column(name = "volume")
    @NotNull
    private int volume;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_satuan_hasil_kegiatan")
    private SatuanHasilKegiatan satuanKegiatan;

    @NotNull
    @Enumerated(EnumType.STRING)
    private StatusRekomendasi status;
    
    @DateTimeFormat(pattern="dd-mm-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_mulai")
    private Date tanggalMulai;
    
    @DateTimeFormat(pattern="dd-mm-yyyy")
    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_selesai")
    private Date tanggalSelesai;

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public SemesterConstant getSemester() {
        return semester;
    }

    public void setSemester(SemesterConstant semester) {
        this.semester = semester;
    }

    public JenisKegiatan getJenisKegiatan() {
        return jenisKegiatan;
    }

    public void setJenisKegiatan(JenisKegiatan jenisKegiatan) {
        this.jenisKegiatan = jenisKegiatan;
    }

    public KategoriKegiatan getKategoriKegiatan() {
        return kategoriKegiatan;
    }

    public void setKategoriKegiatan(KategoriKegiatan kategoriKegiatan) {
        this.kategoriKegiatan = kategoriKegiatan;
    }

    public int getSks() {
        return sks;
    }

    public void setSks(int sks) {
        this.sks = sks;
    }

    public StatusRekomendasi getStatus() {
        return status;
    }

    public void setStatus(StatusRekomendasi status) {
        this.status = status;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public SatuanHasilKegiatan getSatuanKegiatan() {
        return satuanKegiatan;
    }

    public void setSatuanKegiatan(SatuanHasilKegiatan satuanKegiatan) {
        this.satuanKegiatan = satuanKegiatan;
    }

    public Date getTanggalMulai() {
        return tanggalMulai;
    }

    public void setTanggalMulai(Date tanggalMulai) {
        this.tanggalMulai = tanggalMulai;
    }

    public Date getTanggalSelesai() {
        return tanggalSelesai;
    }

    public void setTanggalSelesai(Date tanggalSelesai) {
        this.tanggalSelesai = tanggalSelesai;
    }
    
    
    
}
